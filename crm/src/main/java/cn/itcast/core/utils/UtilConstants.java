package cn.itcast.core.utils;

/**
 * Copyright (C), 2006-2010, Computer Technology info. Co., Ltd.
 * 
 * ����
 * 
 * @author Derek Sun
 * @version 1.00
 *
 */
public interface UtilConstants {
	/**
	 * ��������
	 */
	public static class Common {
		public static final String XXX_YYY_ZZZ = "";
	}
	
	/**
	 * ��̨����������
	 */
	public static class Result {
		public static final String SUCCESS = "0";  // �ɹ�
		public static final String FAILURE = "-1"; // ʧ��
	}
	
	/**
	 * ҳ�泣��
	 */
	public static class FilePath {
		public static final String IMAGE_PATH = "img/a/b";
	}
	
	/**
	 * vo�����һЩ��������������
	 */
	public static class VoFields {
		public static final String ACTION_TIME = "operateTime";   //����ʱ��
		public static final String ACTION_USER_NAME = "operatorName";   //����������
		public static final String CHECK_TIME = "auditTime";   //���ʱ��
		public static final String CHECK_USER_ID = "checkUserId";   //�����ID
	}

}
