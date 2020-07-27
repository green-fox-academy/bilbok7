package sharpie;

import java.awt.Color;

public class Sharpie {
  private String color;
  private float width;
  private float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    this.inkAmount--;
  }

  public float getInkAmount() {
    return inkAmount;
  }

  public void setInkAmount(float inkAmount) {
    this.inkAmount = inkAmount;
  }
}
