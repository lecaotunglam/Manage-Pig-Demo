package qhp.demo.managepig.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pig")
public class Pig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotEmpty
    @Column(name = "pigid", nullable = false)
    private String pigid;

    @Column(name = "weight", nullable = false)
    private String weight;

    @NotEmpty
    @Column(name = "remain", nullable = false)
    private String remain;
    
    @Column(name = "eat", nullable = false)
    private String eat;

    public Pig() {
    }

    public Pig(String pigid, String weight, String remain, String eat) {
        this.pigid = pigid;
        this.weight = weight;
        this.remain = remain;
        this.eat = eat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPigid() {
        return pigid;
    }

    public void setPigid(String pigid) {
        this.pigid = pigid;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRemain() {
        return remain;
    }

    public void setRemain(String remain) {
        this.remain = remain;
    }
    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}