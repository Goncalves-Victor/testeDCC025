/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ice
 */
public class ItemPedido {
    private int indiceItem;
    private Produto produto;
    private int quatidade;

    public ItemPedido(int indiceItem, Produto produto, int quatidade) {
        this.indiceItem = indiceItem;
        this.produto = produto;
        this.quatidade = quatidade;
    }
}
