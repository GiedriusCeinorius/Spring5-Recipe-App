package guru.springframework.controllers;

<<<<<<< HEAD
import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

>>>>>>> b68ac351fd25e56c45ca0847e00f78b7cbe54792
/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

<<<<<<< HEAD
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

=======
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
>>>>>>> b68ac351fd25e56c45ca0847e00f78b7cbe54792
        return "index";
    }
}
