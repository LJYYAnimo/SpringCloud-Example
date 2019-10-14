package com.animo.config.configclient.controller;

import com.animo.config.configclient.entity.PrivateEntity;
import com.animo.config.configclient.entity.PublicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘金泳
 * @Date 2019/9/11
 */
@RestController
public class MainController {

    @Autowired
    private PrivateEntity privateEntity;

    @Autowired
    private PublicEntity publicEntity;

    @RequestMapping("/getPrivate")
    public PrivateEntity getPrivate(){
        return privateEntity;
    }

    @RequestMapping("/getPublic")
    public PublicEntity getPublic(){
        return publicEntity;
    }

}
