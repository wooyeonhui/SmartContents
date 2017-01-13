
public class TomcatConnect {
/*
 * 이클립스와 톰캣 연동하기
 * 1.톰캣 플러그인
 * 2.서버 플러그인
 * 
 * 1.톰캣플러그인을 이용한 연동 이클립스 버전마다 약간씩 다름
 * help ->Install New Software(이전)
 * help ->Eclipse Market Place(이전)
 *   find 창에 tomcat 라고 치고
 *   중간에 있는 tomcat plugin 을 install을 눌려 설치한다
 *   설치한다. 설치후 이클립스가 재시작된다.
 * 
 * 2.플러그인을 통해 이클립스와 톰캣 연동하기
 * window - preference - tomcat
 * 
 * version 을 실제 톰캣하고 버전을 맞춰준다(9.0)
 * 톰캣이 있는 위치값 지정하기
 * 
 * JSP - 프로젝트 - 톰캣 프로젝트 
 * 
 *file - new - project - java - 톰캣 project - Myhome1
 *
 *http://127.0.0.1:9090/Myhome1
 *
 *웹사이트 - 자바입장에서는 context(컨텍스트)
 *
 *웹프로젝트 - 폴더
 *            ㄴ WEB-INF
 *                ㄴclasses
 *                ㄴlib
 *              html
 *              css
 *              javascript
 *              jsp
 * 톰캣에 컨텍스트 설정 -
 * 설정방법 1. server.xml 에 추가
 *        2. context 파일 만들기
 *           톰캣폴더 - conf - Catalina - localhost
 *           폴더아래에 프로젝트명.xml 파일을 만든다.
 * 반드시 utf-8로 저장한다
 * 
 * <Context path="/MyHome2"
 *      reloadable = "true"
 *      docBase="D:\Java\MyHome2"/>
 *           
 */
	 

}
