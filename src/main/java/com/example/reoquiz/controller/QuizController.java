package com.example.reoquiz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/reo-quiz")
public class QuizController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuizController.class);

    private static final String[] FORMS_LINKS = {
            "https://forms.gle/scwrAsWqAKbC75FMA",
            "https://forms.gle/fharSSX67eqEc9XL9",
            "https://forms.gle/UhKrkrL6owNNqQJu5",
            "https://forms.gle/grWXehjkTDmFyfXR9",
            "https://forms.gle/5WV8Bkwrq7xPe62z7"
    };

    @GetMapping("")
    public RedirectView getQuiz() {
        int randomIndex = ThreadLocalRandom.current().nextInt(FORMS_LINKS.length);
        return new RedirectView(FORMS_LINKS[randomIndex]);
    }


}
