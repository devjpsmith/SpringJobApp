package com.devjpsmith.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    public int postId;
    public String postProfile;
    public String postDesc;
    public int reqExperience;
    public List<String> postTechStack;
}
