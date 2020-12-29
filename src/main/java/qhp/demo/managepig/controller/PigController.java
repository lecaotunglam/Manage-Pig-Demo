package qhp.demo.managepig.controller;

import qhp.demo.managepig.entity.Pig;
import qhp.demo.managepig.service.PigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
public class PigController {

    @Autowired
    private PigService pigService;

    @GetMapping("/pig")
    public String list(Model model) {
        model.addAttribute("pigs", pigService.findAll());
        return "list";
    }

    @GetMapping("/pig/search")
    public String search(@RequestParam("term") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/pig";
        }

        model.addAttribute("pigs", pigService.search(term));
        return "list";
    }

    @GetMapping("/pig/add")
    public String add(Model model) {
        model.addAttribute("pig", new Pig());
        return "form";
    }

    @GetMapping("/pig/{id}/edit")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("pig", pigService.findOne(id));
        return "form";
    }

    @PostMapping("/pig/save")
    public String save(@Valid Pig pig, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        pigService.save(pig);
        redirect.addFlashAttribute("successMessage", "Saved pig successfully!");
        return "redirect:/pig";
    }

    @GetMapping("/pig/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        pigService.delete(id);
        redirect.addFlashAttribute("successMessage", "Deleted pig successfully!");
        return "redirect:/pig";
    }

}
