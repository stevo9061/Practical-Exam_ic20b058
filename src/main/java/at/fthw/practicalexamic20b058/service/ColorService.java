package at.fthw.practicalexamic20b058.service;

import at.fthw.practicalexamic20b058.dto.Colors;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

  private final Colors col = new Colors();

    /**
     * Return specific color by.
     * @return specific color
     */
  public String getColorRed() {
      return col.getColorRed();
  }


  public String getColorOrange() {
      return col.getColorOrange();
  }


  public String getColorYellow() {
      return col.getColorYellow();
  }


  public String getColorGreen() {
      return col.getColorGreen();
  }

  public String getColorBlue() {
      return col.getColorBlue();
  }

  public String getColorPurple() {
      return col.getColorPurple();
  }



}
