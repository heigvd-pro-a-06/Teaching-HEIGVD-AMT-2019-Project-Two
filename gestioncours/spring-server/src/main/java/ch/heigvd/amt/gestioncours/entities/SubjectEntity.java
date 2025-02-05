package ch.heigvd.amt.gestioncours.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Crescence Yimnaing on 12/12/19.
 */
@Entity
public class SubjectEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int credits_etcs;

    public long getId() { return id; }

    public String getName() { return name; }

    public int getCredits_etcs() { return credits_etcs; }

    public void setName(String name) { this.name = name; }

    public void setCredits_etcs(int credits_etcs) { this.credits_etcs = credits_etcs; }

}
