package br.com.primeira.primeiraapi.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ItemNotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer sequencial;
    @ManyToOne
    private Produto produto;
    private Double quantidade;
    private BigDecimal valorTotal;
    @ManyToOne
    private NotaFiscal notaFiscal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
//
//    public void setValorTotal() {
//        this.valorTotal =  produto
//                .getValorUnitario()
//                .multiply(new BigDecimal(quantidade));
//    }
}