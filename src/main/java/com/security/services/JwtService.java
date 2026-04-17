package com.security.services;


import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;

@Service
public class JwtService {

    private final String SECRET = "minhachavesupersecretacommaisde32caracteresparadarcertoandrediaseuteamo";

    public String gerarToken(String email){

        return Jwts.builder()
                .setSubject(email)
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .compact();
    }

}
