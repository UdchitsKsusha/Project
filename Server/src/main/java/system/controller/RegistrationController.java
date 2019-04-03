package system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.anotherClass.Other;
import system.entity.UsersEntity;
import system.service.UsersInformationService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegistrationController {

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addNewUser(@ModelAttribute("registrationInformarion") UsersEntity usersEntity) {
        Other rc = new Other();
        UsersInformationService usersService = new UsersInformationService();
        List<UsersEntity> ue = usersService.getUser(usersEntity);
        for(int i=0; i < ue.size();i++)
        {
            if(ue.get(i).getEmail().equals(usersEntity.getEmail())){
                rc.setReturnString("error");
                List<Other> retc = new ArrayList<Other>();
                retc.add(rc);
                return new ModelAndView("index","registrationObject",retc);
            }
        }
        usersService.add(usersEntity);
        rc.setReturnString("confirm");
        List<Other> retc = new ArrayList<Other>();
        retc.add(rc);
        return new ModelAndView("index","registrationObject",retc);
    }


    @RequestMapping(value = "authorisation", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView authorisation(@ModelAttribute("authorisationInformation") UsersEntity usersEntity) {
        Other rc = new Other();
        UsersInformationService usersService = new UsersInformationService();
        List<UsersEntity> ue = usersService.getUser(usersEntity);
        for(int i=0; i<ue.size();i++)
        {
            if(ue.get(i).getEmail().equals(usersEntity.getEmail()) && ue.get(i).getPassword().equals(usersEntity.getPassword())){
                rc.setReturnString("User");
                Other.id_user = ue.get(i).getId();
                List<Other> retc = new ArrayList<Other>();
                retc.add(rc);
                return new ModelAndView("index","authorisationObject",retc);
            }
        }
        rc.setReturnString("error");
        List<Other> retc = new ArrayList<Other>();
        retc.add(rc);
        return new ModelAndView("index","authorisationObject",retc);
    }


    @RequestMapping(value = "exit", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView exit() {
        Other.id_user = 0;
        Other rc = new Other();
        rc.setReturnString("error");
        List<Other> retc = new ArrayList<Other>();
        retc.add(rc);
        return new ModelAndView("index","authorisationObject",retc);
    }
}
