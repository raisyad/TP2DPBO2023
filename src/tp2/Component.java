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
//Class of Component (table component on the db)
public class Component {
  private String cpu,
      graphics_card,
      ram,
      hdd_ssd,
      keyboard,
      camera;
  private Layar layar;
  private int stats_used;
  private Component id_component;

  public Component(String cpu, String graphics_card, String ram, String hdd_ssd, String keyboard, String camera,
      Layar layar,
      int stats_used, Component id_component) {
    this.cpu = cpu;
    this.graphics_card = graphics_card;
    this.ram = ram;
    this.hdd_ssd = hdd_ssd;
    this.keyboard = keyboard;
    this.camera = camera;
    this.layar = layar;
    this.stats_used = stats_used;
    this.id_component = id_component;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public void setGraphics_card(String graphics_card) {
    this.graphics_card = graphics_card;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public void setHdd_ssd(String hdd_ssd) {
    this.hdd_ssd = hdd_ssd;
  }

  public void setKeyboard(String keyboard) {
    this.keyboard = keyboard;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }

  public void setLayar(Layar layar) {
    this.layar = layar;
  }

  public void setStats_used(int stats_used) {
    this.stats_used = stats_used;
  }

  public void setId_component(Component id_component) {
    this.id_component = id_component;
  }

  public String getCpu() {
    return this.cpu;
  }

  public String getGraphics_card() {
    return this.graphics_card;
  }

  public String getRam() {
    return this.ram;
  }

  public String getHdd_ssd() {
    return this.hdd_ssd;
  }

  public String getKeyboard() {
    return this.keyboard;
  }

  public String getCamera() {
    return this.camera;
  }

  public Layar getLayar() {
    return this.layar;
  }

  public int getStats_used() {
    return this.stats_used;
  }

  public Component getId_component() {
    return this.id_component;
  }
}

