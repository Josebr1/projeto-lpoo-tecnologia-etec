/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.model;


/**
 *
 * @author jose
 */
public class Login {
    private String login;
    private String senha;
    
    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Login() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
