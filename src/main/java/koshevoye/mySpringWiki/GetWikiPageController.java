package koshevoye.mySpringWiki;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GetWikiPageController {

	private static final String param1 = "%s";
	
	@GetMapping("/Content")
	// @GetMapping - гарантирует, что GET запрос мапится к требуемому методу
	//@RequestParam связывает зачение переменной name c переменной name в методе.
	//Если в переменной значения нет, в методе используется defaultValue="World"
	public GetWikiPage getPage(@RequestParam(value = "pathToPage", defaultValue="World") String pathToPage) {
		return new GetWikiPage(String.format(param1, pathToPage));
	}
}
