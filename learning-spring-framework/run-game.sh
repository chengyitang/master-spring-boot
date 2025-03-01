#!/bin/bash

# 顏色定義
GREEN='\033[0;32m'
RED='\033[0;31m'
NC='\033[0m' # No Color

# 確保腳本在專案根目錄執行
if [ ! -f "pom.xml" ]; then
    echo -e "${RED}Error: 請在專案根目錄執行此腳本${NC}"
    exit 1
fi

# 主類別
MAIN_CLASS="com.in28minutes.learningspringframework.App02HelloWorldSpring"

echo -e "${GREEN}編譯並執行遊戲應用...${NC}"
echo -e "${GREEN}主類別: ${MAIN_CLASS}${NC}"

# 使用 Maven 編譯
mvn clean compile

# Maven 執行
mvn exec:java -Dexec.mainClass="${MAIN_CLASS}"

# 方法2: 使用 Maven spring-boot 插件執行（如果需要 Spring Boot 的特性）
# mvn -q clean compile spring-boot:run -Dspring-boot.run.main-class="${MAIN_CLASS}" 