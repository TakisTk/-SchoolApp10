package gr.aueb.cf.schoolapp.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "region", fetch = FetchType.LAZY)
    private Set<Teacher> teachers = new HashSet<>();

    public Set<Teacher> getAllTeachers() {
        return Collections.unmodifiableSet(teachers);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.setRegion(this);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
        teacher.setRegion(null);
    }


}
