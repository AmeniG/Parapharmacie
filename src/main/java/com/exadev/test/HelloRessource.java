package com.exadev.test;

import com.exadev.test.Util.JwtUtil;
import com.exadev.test.model.User;
import com.exadev.test.models.AuthenticationRequest;
import com.exadev.test.models.AuthenticationResponse;
import com.exadev.test.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController

@AllArgsConstructor
public class HelloRessource {
    private final AuthenticationManager authenticationManager;
    private final MyUserDetailsService userDetailsService;
    private final JwtUtil jwtTokenUtil;

    private UserRepo userRepo;


    @PostMapping("/signup")
    public User hello(@RequestBody User user){
        return userRepo.save(user);
    }
    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)throws Exception{
        try { authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
        );
        }catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password",e );
        }
        final UserDetails userDetails= userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        final String jwt=jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

}

