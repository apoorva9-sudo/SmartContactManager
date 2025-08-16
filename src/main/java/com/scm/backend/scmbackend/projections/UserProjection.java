package com.scm.backend.scmbackend.projections;

import com.scm.backend.scmbackend.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.config.Projection;


@Projection(name="user-projection",types={User.class})
public interface UserProjection {

    String getName();
    String getEmail();
    String getAbout();
}
