package com.sk.userService;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import io.jsonwebtoken.*;
import java.util.Date; 
import javax.xml.bind.DatatypeConverter;

public class TokenService{
	
	//Sample method to construct a JWT
	private String createJWT(String id, String issuer, String subject, long ttlMillis) {
	 
	    //The JWT signature algorithm we will be using to sign the token
	    SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
	 
	    long nowMillis = System.currentTimeMillis();
	    Date now = new Date(nowMillis);
	 
	    //We will sign our JWT with our ApiKey secret
	    byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("iuhashiufh9891383");
	    Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
	 
	    //Let's set the JWT Claims
	    JwtBuilder builder = Jwts.builder().setId(id)
	                                .setIssuedAt(now)
	                                .setSubject(subject)
	                                .setIssuer(issuer)
	                                .signWith(signatureAlgorithm, signingKey);
	 
	    //if it has been specified, let's add the expiration
	    if (ttlMillis >= 0) {
	    long expMillis = nowMillis + ttlMillis;
	        Date exp = new Date(expMillis);
	        builder.setExpiration(exp);
	    }
	 
	    //Builds the JWT and serializes it to a compact, URL-safe string
	    return builder.compact();
	}
	
	//Sample method to validate and read the JWT
	private void parseJWT(String jwt) {
	 
	    //This line will throw an exception if it is not a signed JWS (as expected)
	    Claims claims = Jwts.parser()         
	       .setSigningKey(DatatypeConverter.parseBase64Binary("iuhashiufh9891383"))
	       .parseClaimsJws(jwt).getBody();
	    System.out.println("ID: " + claims.getId());
	    System.out.println("Subject: " + claims.getSubject());
	    System.out.println("Issuer: " + claims.getIssuer());
	    System.out.println("Expiration: " + claims.getExpiration());
	}
	
	
	
	//KESA
	
	public static boolean validate(String token, String user){
        Claims claims = parseToken(token);
        int id = Integer.parseInt((String) claims.get("userId"));
        String role = (String) claims.get("role");

        System.out.println(claims.get("role") + " " + claims.get("userId"));
        System.out.println(role.equals(user));
        if (role.equals(user)){

            if(role.equals("admin")){
                System.out.println("ALO BREEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                return true;
            }

            else if(role.equals("student")){
            	 System.out.println("ALO BREEEEEEEEEEEEEEEEEEEEEEEEEEEEEE STUDENTEEE");
                return true;
            }
        }
        return false;
    }

    public static String generate(String tip, String id) {
        Claims claims = Jwts.claims()
                .setSubject("username");
        System.out.println(id + " evo ga id");
        claims.put("userId", id);
        claims.put("role", tip);



        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "afafoiafw1313s")
                .compact();
    }

    public static Claims parseToken(String jwt) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey("afafoiafw1313s")
                    .parseClaimsJws(jwt)
                    .getBody();
        } catch (Exception e) {
            return null;
        }
        return claims;
    }
	
}