package Day14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex07_File {

	public static void menu() {
		System.out.println("########## 파일 관리 ###########");
		System.out.println("1. 디렉토리 생성");
		System.out.println("2. 파일 생성");
		System.out.println("3. 디렉토리 파일목록");
		System.out.println("4. 파일정보 조회");
		System.out.println("5. 파일 삭제");
		System.out.println("6. 폴더 삭제");
		System.out.println("0. 종료");
		System.out.println("########## 번호 :");
	}
	
	/**
	 * 디렉토리를 생성하는 메소드
	 * @param filePath
	 */
	public static void makeDirectory(String filePath) {
		File file = new File(filePath);
		// 폴더 생성 메소드
		// mkdir() 	: 생성할 경로의 상위 경로까지 기본 디렉토리가 존재해야한다.
		// mkdirㄴ() : 생성할 경로의 상위 경로까지 디렉토리가 생성해준다.
		if(file.mkdir()) {
			System.out.println("디렉토리 생성 성공!");
		}
		else {
			System.err.println("디렉토리 생성 실패!");
		}
		System.out.println("경로 : " + filePath);
	}
	
	/**
	 * 파일 생성 
	 * @param filePath
	 */
	public static void makeFile(String filePath) {
		File file = new File(filePath);
		
		try {
			
		
		if(file.createNewFile()) {
			System.out.println("파일 생성 성공!");
		}
		else { 
			System.err.println("파일 생성 실패!");
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
			System.out.println("파일 : " + filePath);
	}
	
	/**
	 * 디렉토리의 파일목록을 가져오는 메소드
	 * @param filePath
	 * @return
	 */
	public static File[] fileList(String filePath) {
		
		System.out.println(filePath);
		System.out.println("---------------------------------------");
		File file = new File(filePath);
		File[] fileList = file.listFiles(); // 하위 경로의 있는 파일 목록
		
		for (File subFile : fileList) {
			long update = subFile.lastModified();	// 수정일자
			Date date = new Date(update);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String updateDate = sdf.format(date);
			
			System.out.print(subFile.getName() + "\t\t");
			System.out.print(subFile.length() + "\t\t");
			System.out.print(updateDate + "\t\t");
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		return fileList;
	}
	
	/**
	 * 파일 정보 조회 메소드
	 * @param filePath
	 */
	public static void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.println("파일 종류 : ");
		if(file.isDirectory()) System.out.println("디렉토리");
		if(file.isFile()) System.out.println("일반파일");
		
		System.out.println("파일명 : \t\t" + file.getName());
		System.out.println("파일크기 : \t" + file.length());
		
		long update = file.lastModified();	// 수정일자
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		System.out.println("수정일자 : \t" + updateDate);
	}
	
	/**
	 * 파일 삭제 메소드
	 * @param filePath
	 */
	public static void deleteFile(String filePath) {
		
		File file = new File(filePath);
		
		// 파일 존재여부 확인
		if(file.exists()) {
			// delete() : 파일 삭제 성공(true), 실패(false)
			// * 하위 경로에 파일이 존재하면 삭제가 되지 않는다.
			if(file.delete()) {
				System.out.println("파일 삭제 성공!");
			}
			else {
				System.err.println("파일 삭제 실패!");
			}
		}
		else {
			System.err.println("파일이 존재하지 않습니다.");
		}
	}
	
	/**
	 * 폴더를 삭제하는 메소드
	 * @param filePath
	 */
	public static void deleteDirectory(String filePath) {
		File file = new File(filePath);
		File[] subFiles = file.listFiles();
		
		// 하위 경로에 파일이 있으면
		if(subFiles != null) {
			// 하위 경로의 파일들을 삭제
			for (File subFile : subFiles) {
				// 재귀함수
				deleteDirectory(subFile.getPath());
			}
		}
		
		// 폴더 삭제
		if(file.delete()) {
			System.out.println("폴더 삭제 성공!");
		} else {
			System.err.println("폴더 삭제 실패!");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menuNo;
		
		do {
			menu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if(menuNo == 0) break;
			
			System.out.println("파일 경로 : ");
			String filePath = sc.nextLine();
			
			switch (menuNo) {
			case 1:
					// 디렉토리 생성 - 입력 : 디렉토리 경로
					makeDirectory(filePath);
					break;
			case 2:
					// 파일 생성 - 입력 : 디렉토리 경로
					makeFile(filePath);
					break;
			case 3:
					// 디렉토리 파일목록 - 입력 : 디렉토리 경로
					fileList(filePath);
					break;
			case 4:
					// 파일 정보 조회 - 입력 : 파일경로
					fileInfo(filePath);
					break;
			case 5:
					// 파일 삭제 - 입력 : 파일경로
					deleteFile(filePath);
					break;
			case 6:
					// 파일 삭제 - 입력 : 폴더경로
					deleteDirectory(filePath);
					break;
				
		

			default:
				break;
			}
		} while (true);
		
	}
	
}


















