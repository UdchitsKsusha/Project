package system.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import system.entity.ContactinformationEntity;
import system.service.InformationService;

@Controller
public class ContactController {
    @RequestMapping(value="contactInformation", method = RequestMethod.GET)
    public String contactInformationGet(Model model)
    {
        return "contact";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String addContactInformation(@ModelAttribute("contactInformation") ContactinformationEntity ContactinformationEntity) {
        InformationService contactinformationService = new InformationService();
        contactinformationService.add(ContactinformationEntity);
        return "contact";
    }
}
