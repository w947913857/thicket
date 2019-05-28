package com.jungle.serviceImpl;

import com.jungle.bean.Reguser;
import com.jungle.bean.ReguserExample;
import com.jungle.dao.ReguserMapper;
import com.jungle.service.Desk_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Aimelony
 * @Date 2019/5/27 20:30
 * @File Desk_ServiceImpl
 **/
@Service
@Transactional
public class Desk_ServiceImpl implements Desk_Service {
    @Autowired
    private ReguserMapper reguserMapper;

    @Override
    public Reguser login(Reguser reguser) {
        System.out.println(reguser);
        ReguserExample reguserExample = new ReguserExample();
        ReguserExample.Criteria criteria = reguserExample.createCriteria();
        criteria.andUsernameEqualTo(reguser.getUsername());
        criteria.andPwdEqualTo(reguser.getPwd());
        List<Reguser> regusers = reguserMapper.selectByExample(reguserExample);
        System.out.println(regusers.toString());
        if (regusers != null && regusers.size() > 0)
            return regusers.get(0);
        else
            return null;
    }

    /**
     * 验证手机号（用户名）是否存在
     *
     * @param mobile 手机号（用户名）
     * @return true：存在  false：不存在
     */
    @Override
    public boolean checkMobile(String mobile) {
        ReguserExample reguserExample = new ReguserExample();
        ReguserExample.Criteria criteria = reguserExample.createCriteria();
        criteria.andUsernameEqualTo(mobile);
        List<Reguser> regusers = reguserMapper.selectByExample(reguserExample);
        if (regusers != null && regusers.size() > 0)
            return true;
        else
            return false;
    }

    /**
     * 添加用户（注册）
     *
     * @param reguser
     * @return
     */
    @Override
    public int insReguser(Reguser reguser) {
        reguser.setUsername(reguser.getMobile());
        int i = reguserMapper.insertSelective(reguser);
        return i;
    }


}
