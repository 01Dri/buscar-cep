package me.dri.buscarcep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@Document
public class Address {
    //  {
    //  "cep": "86183-510",
    //  "logradouro": "Rua Francisco Lopes Hernandes",
    //  "complemento": "",
    //  "bairro": "Parque Residencial Ana Rosa",
    //  "localidade": "Cambé",
    //  "uf": "PR",
    //  "ibge": "4103701",
    //  "gia": "",
    //  "ddd": "43",
    //  "siafi": "7471"
    //}

    @Id
    private String id;
    private String cep;
    private String logradouro;
    private String complemento;

    private String  bairro;
    private String localidade;
    private String uf;

    private String ibge;

    private String  ddd;

    private String siafi;

    public Address() {

    }

    public Address(String id, String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String ddd, String siafi) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(cep, address.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep);
    }
}
