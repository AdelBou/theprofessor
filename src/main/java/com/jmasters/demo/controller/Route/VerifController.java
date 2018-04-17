package com.jmasters.demo.controller.Route;

import com.jmasters.demo.controller.ViewModel.DossierModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
class VerifController {

    @RequestMapping(value = "/Verification", method = RequestMethod.GET)
    public String Verif(DossierModel dossierModel, Model model) {
        DossierModel dossierModel1 = new DossierModel();
        dossierModel1.premierCycle=22;
        model.addAttribute("dosMod",dossierModel1 );
        return "/Verification";


    }


}
