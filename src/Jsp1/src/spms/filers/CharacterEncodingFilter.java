package spms.filers;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	FilterConfig config = null;
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res
			, FilterChain fc)
			throws IOException, ServletException {
		String encoding = this.config.getInitParameter("encoding");
		
		req.setCharacterEncoding(encoding);

		fc.doFilter(req, res);
	}
	
	@Override
	public void destroy() {
		System.out.println("문자열 설정 필터 종료");
	}

}
