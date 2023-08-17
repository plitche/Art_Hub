CREATE TABLE test (
      seq     INT NOT NULL AUTO_INCREMENT,
      testId   VARCHAR(12),
      testPw   VARCHAR(12),
      PRIMARY KEY(seq)
) ENGINE=MYISAM CHARSET=utf8;

-- art_hub.article definition
CREATE TABLE `article` (
   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '번호',
   `subject_id` tinyint NOT NULL COMMENT '주제번호',
   `title` varchar(100) NOT NULL COMMENT '제목',
   `content` longtext COMMENT '내용',
   `writer` varchar(30) NOT NULL COMMENT '작성자',
   `reg_date` datetime NOT NULL COMMENT '등록일',
   `mod_date` datetime DEFAULT NULL COMMENT '수정일',
   `del_yn` char(1) NOT NULL DEFAULT 'N' COMMENT '삭제여부',
   PRIMARY KEY (`id`)
) COMMENT='작품 게시글';

-- art_hub.subject definition
CREATE TABLE `subject` (
   `id` int NOT NULL AUTO_INCREMENT COMMENT '번호',
   `group` tinyint NOT NULL COMMENT '그룹',
   `name` varchar(100) NOT NULL COMMENT '주제명',
   `creator` varchar(30)  NOT NULL COMMENT '생성자',
   `reg_date` datetime NOT NULL COMMENT '생성날짜',
   `editor` varchar(30)  DEFAULT NULL COMMENT '수정자',
   `mod_date` datetime DEFAULT NULL COMMENT '수정날짜',
   PRIMARY KEY (`id`)
) COMMENT='주제';

CREATE TABLE `notice` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL COMMENT '제목',
  `content` TEXT NOT NULL COMMENT '내용',
  `writer` VARCHAR(20) NOT NULL COMMENT '작성자',
  `editor` VARCHAR(20) NULL DEFAULT NULL COMMENT '수정자',
  `reg_date` DATETIME NOT NULL COMMENT '등록일',
  `mod_date` DATETIME NULL DEFAULT NULL COMMENT '수정일',
  `del_yn` CHAR(1) NOT NULL DEFAULT 'N' COMMENT '삭제여부',
  PRIMARY KEY (`id`)
) COMMENT='공지사항';

CREATE TABLE `attachment` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `refer_table` VARCHAR(50) NOT NULL COMMENT '참조 테이블명',
  `refer_id` BIGINT NOT NULL COMMENT '참조 아이디',
  `origin_file_name` VARCHAR(255) NOT NULL COMMENT '원파일명',
  `file_path` VARCHAR(255) NOT NULL COMMENT '파일저장경로',
  `file_name` VARCHAR(255) NOT NULL COMMENT '변환된 파일명',
  `file_size` INT NOT NULL DEFAULT '0' COMMENT '파일사이즈',
  `reg_date` DATETIME NOT NULL COMMENT '등록일',
  `del_yn` CHAR(1) NOT NULL DEFAULT 'N' COMMENT '삭제여부',
  PRIMARY KEY (`id`)
) COMMENT='첨부파일';