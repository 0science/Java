package top.dingjm.zhxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dingjm.zhxy.util.CreateVerifiCodeImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
@RequestMapping("/sms/system")
public class SystemController {
    @GetMapping("/getVerifiCodeImage")
    public void getVerifiCodeImage(HttpServletRequest request, HttpServletResponse response){
       BufferedImage verifiCodeImage = CreateVerifiCodeImage.getVerifiCodeImage();

       String verifiCode = new String(CreateVerifiCodeImage.getVerifiCode());

        HttpSession session = request.getSession();

        session.setAttribute("verifiCode", verifiCode);

        try {
            ImageIO.write(verifiCodeImage,"JPEG",response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
