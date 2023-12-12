package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args)
			throws MalformedURLException {
		
		URL url = new URL("https://www.google.com/search?q=kim+yuna&sca_esv=589698990&hl=ko&source=hp&ei=Mqh2ZYWVLo2r0-kP-_eq0AE&iflsig=AO6bgOgAAAAAZXa2QgUTdCJm8WPxcujH2PfYcc3gFQdj&ved=0ahUKEwiF9oGA3YaDAxWN1TQHHfu7ChoQ4dUDCAw&uact=5&oq=kim+yuna&gs_lp=Egdnd3Mtd2l6IghraW0geXVuYTIFEC4YgAQyBRAAGIAEMgUQLhiABDIFEC4YgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgARIsChQ9Q1YqiJwAXgAkAEAmAGXAaABlgeqAQMxLje4AQPIAQD4AQGoAgrCAgoQABgDGI8BGOoCwgIKEC4YAxiPARjqAsICERAuGIAEGLEDGIMBGMcBGNEDwgILEAAYgAQYsQMYgwHCAhQQLhiABBixAxiDARjHARjRAxjUAsICCxAuGIAEGLEDGIMBwgIEEAAYA8ICDhAuGIAEGLEDGMcBGNEDwgIIEAAYgAQYsQPCAggQLhiABBixA8ICERAuGIAEGLEDGIMBGMcBGK8BwgIIEC4YsQMYgATCAgQQLhgDwgIHEAAYgAQYCsICBxAuGIAEGAo&sclient=gws-wiz");
		
//		https://www.google.com/
//		search?
//		q=kim+yuna
//		&sca_esv=589698990
//		&hl=ko
//		&source=hp&ei=Mqh2ZYWVLo2r0-kP-_eq0AE&iflsig=AO6bgOgAAAAAZXa2QgUTdCJm8WPxcujH2PfYcc3gFQdj&ved=0ahUKEwiF9oGA3YaDAxWN1TQHHfu7ChoQ4dUDCAw&uact=5&oq=kim+yuna&gs_lp=Egdnd3Mtd2l6IghraW0geXVuYTIFEC4YgAQyBRAAGIAEMgUQLhiABDIFEC4YgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgARIsChQ9Q1YqiJwAXgAkAEAmAGXAaABlgeqAQMxLje4AQPIAQD4AQGoAgrCAgoQABgDGI8BGOoCwgIKEC4YAxiPARjqAsICERAuGIAEGLEDGIMBGMcBGNEDwgILEAAYgAQYsQMYgwHCAhQQLhiABBixAxiDARjHARjRAxjUAsICCxAuGIAEGLEDGIMBwgIEEAAYA8ICDhAuGIAEGLEDGMcBGNEDwgIIEAAYgAQYsQPCAggQLhiABBixA8ICERAuGIAEGLEDGIMBGMcBGK8BwgIIEC4YsQMYgATCAgQQLhgDwgIHEAAYgAQYCsICBxAuGIAEGAo&sclient=gws-wiz
		
		// URL 이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : " + url.getProtocol()); 
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
		
		
	}
}
