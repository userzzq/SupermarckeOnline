package top.wfzzq.supermarckeonline.model;

import top.wfzzq.supermarckeonline.base.BasePageModel;

/**
 * -测试model
 *
 * @author DarkKnight
 *
 */
public class TestModel extends BasePageModel {
  private static final long serialVersionUID = -2661095345363340253L;

  private String imageCode = "";

  public String getImageCode() {
    return imageCode;
  }

  public void setImageCode(String imageCode) {
    this.imageCode = imageCode;
  }
}
