package com.ebook.dto.user;

import com.ebook.dto.FileDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(exclude = {"profileImage", "url"})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements UserDetails, OAuth2User {
    @NotBlank
    @Length(min = 4, max = 16)
    private String id;
    private String ci;
    @NotBlank
    private String password;
    private String email;
    private String name;
    private String nickname;
    private FileDTO profileImage;
    private Map<String, Object> attributes;

    @Override
    public Map<String, Object> getAttributes() {
        return Map.of();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("READONLY"));
    }

    @Override
    public String getUsername() {
        return this.id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

//    public void setProfileImage(byte[] profileImage) {
//        this.profileImage = profileImage;
//        try{
//            this.url = Base64.getEncoder().encodeToString(profileImage);
//        }catch (Exception e){}
//    }
}
