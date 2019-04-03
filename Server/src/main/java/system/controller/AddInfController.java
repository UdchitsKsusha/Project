package system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import system.anotherClass.Other;
import system.entity.CategoryOfServicesEntity;
import system.entity.ServiceEntity;
import system.entity.ServiceFormEntity;
import system.entity.UsersEntity;
import system.service.CategoryService;
import system.service.ServiceFormService;
import system.service.ServiceServiceInformation;

import java.util.ArrayList;
import java.util.List;

@Controller

public class AddInfController {
    Other rc = new Other();
    @RequestMapping(value = "addBrow", method = RequestMethod.POST)
    public String addBrow(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> browList = serviceService.getBrow();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("browList",browList);
            return "brow";
        }
    }

    @RequestMapping(value = "addDepil", method = RequestMethod.POST)
    public String addDepil(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> depilList = serviceService.getDepil();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("depilList",depilList);
            return "depil";
        }
    }

    @RequestMapping(value = "addHair", method = RequestMethod.POST)
    public String addHair(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> hairList = serviceService.getHair();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("hairList",hairList);
            return "hair";
        }
    }

    @RequestMapping(value = "addKosm", method = RequestMethod.POST)
    public String addKosm(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> kosmList = serviceService.getKosm();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("kosmList",kosmList);
            return "kosm";
        }
    }

    @RequestMapping(value = "addMakeup", method = RequestMethod.POST)
    public String addMakeup(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> makeupList = serviceService.getMakeup();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("makeupList",makeupList);
            return "makeup";
        }
    }

    @RequestMapping(value = "addNail", method = RequestMethod.POST)
    public String addNail(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> nailList = serviceService.getNail();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("nailList",nailList);
            return "nail";
        }
    }

    @RequestMapping(value = "addPerm", method = RequestMethod.POST)
    public String addPerm(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> permList = serviceService.getPerm();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("permList",permList);
            return "perm";
        }
    }

    @RequestMapping(value = "addSpa", method = RequestMethod.POST)
    public String addSpa(Model model, @RequestParam int id) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> spaList = serviceService.getSpa();
        int ind = Other.id_user;
        ServiceFormEntity serviceFormEntity = new ServiceFormEntity();
        ServiceFormService serviceFormService = new ServiceFormService();
        if(ind != 0)
        {
            Other.idServ = id;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "form";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("spaList",spaList);
            return "spa";
        }
    }

    @RequestMapping(value = "addInformation", method = RequestMethod.POST)
    public String addInformation(Model model, @ModelAttribute("addInformation") ServiceFormEntity serviceFormEntity) {

        Other rc = new Other();
        ServiceFormService serviceFormService = new ServiceFormService();

        List<UsersEntity> UsersID = serviceFormService.getU();
        List<ServiceEntity> ServiceID = serviceFormService.getS();

        serviceFormEntity.setServiceEntity(ServiceID.get(0));
        serviceFormEntity.setUsersEntity(UsersID.get(0));

        serviceFormService.add(serviceFormEntity);

        CategoryService categoryOfServicesService = new CategoryService();
        List<CategoryOfServicesEntity> categoryList = categoryOfServicesService.getAll();
        rc.setReturnString("User");
        List<Other> retc = new ArrayList<Other>();
        retc.add(rc);
        model.addAttribute("authorisationObject", retc);
        model.addAttribute("categoryList",categoryList);
        return "gallery";
    }

    @RequestMapping(value = "deleteInformation", method = RequestMethod.POST)
    public String deleteInformation(Model model, @RequestParam int id, @ModelAttribute("addInformation") ServiceFormEntity serviceFormEntity) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> spaList = serviceService.getSpa();
        int ind = Other.id_user;
        ServiceFormService serviceFormService = new ServiceFormService();
        Other.idServ = id;
        rc.setReturnString("User");
        List<ServiceFormEntity> serviceList = serviceFormService.getDeleteInformation();
        serviceFormEntity.setId(serviceList.get(0).getId());
        serviceFormEntity.setUsersEntity(serviceList.get(0).getUsersEntity());
        serviceFormEntity.setServiceEntity(serviceList.get(0).getServiceEntity());
        serviceFormService.remove(serviceFormEntity);
        List<Other> retc = new ArrayList<Other>();
        retc.add(rc);
        model.addAttribute("authorisationObject", retc);
        return "index";
    }

    @RequestMapping(value = "editInformation", method = RequestMethod.POST)
    public String editInformation(Model model, @RequestParam int id, @RequestParam int idS) {
        ServiceServiceInformation serviceService = new ServiceServiceInformation();
        List<ServiceEntity> spaList = serviceService.getSpa();
        int ind = Other.id_user;
        if(ind != 0)
        {
            Other.id = id;
            Other.idServ = idS;
            rc.setReturnString("User");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            return "formEdit";
        }
        else {
            rc.setReturnString("error");
            List<Other> retc = new ArrayList<Other>();
            retc.add(rc);
            model.addAttribute("authorisationObject", retc);
            model.addAttribute("spaList",spaList);
            return "index";
        }
    }

    @RequestMapping(value = "editInfo", method = RequestMethod.POST)
    public String editInfo(Model model, @ModelAttribute("editInfo") ServiceFormEntity serviceFormEntity) {
        Other rc = new Other();
        ServiceFormService serviceFormService = new ServiceFormService();

        List<UsersEntity> UsersID = serviceFormService.getU();
        List<ServiceEntity> ServiceID = serviceFormService.getS();

        serviceFormEntity.setId(Other.getId());
        serviceFormEntity.setServiceEntity(ServiceID.get(0));
        serviceFormEntity.setUsersEntity(UsersID.get(0));

        serviceFormService.edit(serviceFormEntity);

        CategoryService categoryOfServicesService = new CategoryService();
        List<CategoryOfServicesEntity> categoryList = categoryOfServicesService.getAll();
        rc.setReturnString("User");
        List<Other> retc = new ArrayList<Other>();
        retc.add(rc);
        model.addAttribute("authorisationObject", retc);
        model.addAttribute("categoryList",categoryList);
        return "index";
    }
}
