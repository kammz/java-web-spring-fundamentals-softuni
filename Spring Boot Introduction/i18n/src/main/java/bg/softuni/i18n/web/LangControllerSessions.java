package bg.softuni.i18n.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LangControllerSessions {

    @GetMapping("/sessions")
    public String langCookies(HttpSession session,
                              Model model) {

        var lang = session.getAttribute("lang");
        if (lang == null) {
            lang = "bg";
        }

        //TODO:
        //to work we need to change org.springframework.boot version to 2.7.16!
        //version later then 2.7.16 does not allow manual access to the session
        session.setAttribute("name", "Pesho");

        model.addAttribute("lang", lang);

        return "sessions-lang";
    }

    @PostMapping("/sessions")
    public String langCookies(@RequestParam("lang") String lang,
                              HttpSession session) {

        session.setAttribute("lang", lang);

        return "redirect:/sessions";
    }
}
