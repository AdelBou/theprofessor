package com.jmasters.demo.controller.Route;

import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.service.storage.StorageFileNotFoundException;
import com.jmasters.demo.service.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    public static final String uploadingdir = System.getProperty("user.dir") + "/uploadingdir/";
    @Autowired
    private  StorageService storageService;







    @GetMapping("/download")
    public String listUploadedFiles(Model model) throws IOException {
        try {
        model.addAttribute("files", storageService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(HomeController.class,
                        "serveFile", path.getFileName().toString()).build().toString())
                .collect(Collectors.toList()));
        }
        catch (Exception e){

        }
        return "uploadForm";
    }


    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

        Resource file = storageService.loadAsResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,

                                   RedirectAttributes redirectAttributes) {

        storageService.store(file);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }

    @RequestMapping  ("/")
    public String index( ) {
        return "index";
    }

    @GetMapping("/Login")
    public String login() {
        return "/login";

    }

    @PostMapping("/Login")
    public String login(Model model ,@RequestParam("typeUser") int type) {
        System.out.println("type=="+ type);
        switch (type){
            case 1:
            {
                return "/Depot";
            }
            case 2:{
                return "/Verification";
            }
            case 3:{
                return "/Validation";
            }
            case 4:{
                return "/Evaluation";
            }
        }
        return "/login";
    }



    @RequestMapping("/register")
    public String register() {
        return "/register";

    }

    @RequestMapping("/Dossier")
    public String dossier() {
        return "/Dossier";

    }
    @RequestMapping("/admin")
    public String admin() {
        return "/admin";

    }
    @RequestMapping("/Candidat")
    public String candidat() {
        return "/Candidat";

    }
    @RequestMapping("/Grille")
    public String grille() {
        return "/Grille";

    }






    @RequestMapping("/Evaluation")
    public String Eval() {
        return "/Evaluation";

    }
    @RequestMapping("/ResponsableVerif")
    public String Verif() {
        return "/ResponsableVerif";

    }

    @RequestMapping("/RespoEtablissement")
    public String RespoEtablissement() {
        return "/RespoEtablissement";
    }
    @RequestMapping("/Test")
    public String Test() {
        return "/Test";

    }

    @RequestMapping("/Validation")
    public String Validation() {
        return "/Validation";

    }

}
