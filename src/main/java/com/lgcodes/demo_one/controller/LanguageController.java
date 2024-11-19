package com.lgcodes.demo_one.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@RequiredArgsConstructor
@RestController
@RequestMapping("/languages")
public class LanguageController {
    private final LocaleResolver localeResolver;
    private final HttpServletRequest httpServletRequest;
    private final HttpServletResponse httpServletResponse;

    @GetMapping("/locale/{loc}")
    public ResponseEntity<Void> changeLocale(@PathVariable("loc") String loc){
        Locale userLocale = switch (loc){
            case "en" -> Locale.ENGLISH;
            case "fr" -> Locale.FRANCE;
            default -> Locale.ROOT;
        };

        localeResolver.setLocale(httpServletRequest, httpServletResponse, userLocale);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
