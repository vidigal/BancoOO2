package br.com.bancooo.dominio;

public class Cliente extends Pessoa {

    private boolean vip;

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
