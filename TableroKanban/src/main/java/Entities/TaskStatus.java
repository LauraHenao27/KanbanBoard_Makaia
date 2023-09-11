package Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "task_status")
public enum ProjectStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_status_task;


    @Column(nullable = false)
    private String name_status;
    //TODOINPROGRESSBLOCKEDDONE*/
}
