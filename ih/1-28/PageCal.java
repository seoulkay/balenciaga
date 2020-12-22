package playGround;

public class PageCal {

	public static void main(String[] args) {
		PageManager postPm = new PageManager();
		
		//커런트 페이지, 토탈 사이즈, 맥스 페이저(5);
		postPm.setCurrentPage(3);
		postPm.setTotal(33);
		postPm.setMaxPager(5);
		
		postPm = currentPagerCalculator(postPm);
		
		//System.out.println(postPm.getStartPage());
		//System.out.println(postPm.getEndPage());
		
		//model.addAttribute("pm", postPm);
		
		
	}
	
	//public static postall() {
	//	currentPagerCalculator(6, 5, 33);
	//}
	
	
	//커런트 페이지를 넣으면 몇번째 페이지 maxPager = 5
	public static PageManager currentPagerCalculator(PageManager pm){
		PageManager result = new PageManager();
		
		int endPage = 0;
		endPage =  (int) Math.ceil((pm.getCurrentPage()+1) / (double)pm.getMaxPager()) * pm.getMaxPager();
		
		int realEndPage = (int)Math.ceil(pm.getTotal()/pm.getMaxPager())+1;
		
		result.setStartPage(endPage-pm.getMaxPager());
		
		//거짓의 마지막 페이지가 되면 진리의 마지막 페이지로 교체
		if(endPage > realEndPage) {
			endPage = realEndPage;
		}
			
		
		result.setEndPage(endPage);
		result.setTotal(pm.getTotal());
		result.setCurrentPage(pm.getCurrentPage());
		result.setMaxPager(pm.getMaxPager());
		
		
		return result;
	}

	

}
