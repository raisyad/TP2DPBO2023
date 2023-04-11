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
//Class of Layar (table layar on the db)
public class Layar {
  private String ukuran_layar,
      jenis_layar,
      jenis_panel,
      resolusi_layar;
  private int stats_used;

  public Layar(String ukuran_layar, String jenis_layar, String jenis_panel, String resolusi_layar, int stats_used) {
    this.ukuran_layar = ukuran_layar;
    this.jenis_layar = jenis_layar;
    this.jenis_panel = jenis_panel;
    this.resolusi_layar = resolusi_layar;
    this.stats_used = stats_used;
  }

  public void setUkuran_layar(String ukuran_layar) {
    this.ukuran_layar = ukuran_layar;
  }

  public void setJenis_layar(String jenis_layar) {
    this.jenis_layar = jenis_layar;
  }

  public void setJenis_panel(String jenis_panel) {
    this.jenis_panel = jenis_panel;
  }

  public void setResolusi_layar(String resolusi_layar) {
    this.resolusi_layar = resolusi_layar;
  }

  public void setStats_used(int stats_used) {
    this.stats_used = stats_used;
  }

  public String getUkuran_layar() {
    return this.ukuran_layar;
  }

  public String getJenis_layar() {
    return this.jenis_layar;
  }

  public String getJenis_panel() {
    return this.jenis_panel;
  }

  public String getResolusi_layar() {
    return this.resolusi_layar;
  }

  public int getStats_used() {
    return this.stats_used;
  }
}


