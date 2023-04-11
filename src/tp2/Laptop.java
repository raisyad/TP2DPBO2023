/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author raisy
 */
// Class of laptop (table laptop on the db)
public class Laptop {
  private int id_laptop;
  private String merk_laptop,
      model_laptop,
      jenis_laptop,
      image_laptop;
  private Component id_component;

  public Laptop(String merk_laptop, String model_laptop, String jenis_laptop, String image_laptop, int id_laptop,
      Component id_component) {
    this.merk_laptop = merk_laptop;
    this.model_laptop = model_laptop;
    this.jenis_laptop = jenis_laptop;
    this.image_laptop = image_laptop;
    this.id_laptop = id_laptop;
    this.id_component = id_component;
  }

  public void setMerk_laptop(String merk_laptop) {
    this.merk_laptop = merk_laptop;
  }

  public void setModel_laptop(String model_laptop) {
    this.model_laptop = model_laptop;
  }

  public void setJenis_laptop(String jenis_laptop) {
    this.jenis_laptop = jenis_laptop;
  }

  public void setImage_laptop(String image_laptop) {
    this.image_laptop = image_laptop;
  }

  public void setId_laptop(int id_laptop) {
    this.id_laptop = id_laptop;
  }

  public void setId_component(Component id_component) {
    this.id_component = id_component;
  }

  public String getMerk_laptop() {
    return this.merk_laptop;
  }

  public String getModel_laptop() {
    return this.model_laptop;
  }

  public String getJenis_laptop() {
    return this.jenis_laptop;
  }

  public String getImage_laptop() {
    return this.image_laptop;
  }

  public int getId_laptop() {
    return this.id_laptop;
  }

  public Component getId_component() {
    return this.id_component;
  }

}


