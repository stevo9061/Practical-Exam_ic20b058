package at.fthw.practicalexamic20b058.controller;

import at.fthw.practicalexamic20b058.dto.Colors;
import at.fthw.practicalexamic20b058.service.ColorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {

    private ColorService colorService;


    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    /**
     * @param msg By adding a specific color, you get the complementary color.
     * @return complementary color or invalid colorgit
     */
    @GetMapping("/color/{msg}")
    String specificColor(@PathVariable String msg) {

        if(msg.equals("Red")) {
            return colorService.getColorGreen();

        } else if(msg.equals("Orange")) {
            return colorService.getColorBlue();

        } else if(msg.equals("Yellow")) {
            return colorService.getColorPurple();

        } else if(msg.equals("Green")) {
            return colorService.getColorRed();

        } else if(msg.equals("Blue") ) {
            return colorService.getColorOrange();

        } else if(msg.equals("Purple")) {
            return colorService.getColorYellow();
        }

        return "Invalid Color";

    }
}
