package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoriteController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String favorites(ModelMap modelMap) {
        List<Gif> allFavorite = gifRepository.getAllFavorite();
        modelMap.put("gifs", allFavorite);
        return "favorites";
    }
}
