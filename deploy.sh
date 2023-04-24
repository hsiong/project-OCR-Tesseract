
# 授权
sudo chown -R $(whoami) /opt/homebrew/Cellar

# 手动生成部分文件夹
mkdir /opt/homebrew/Cellar/boost/1.78.0                                                             [12:44:05]
mkdir /opt/homebrew/Cellar/ffmpeg@4/4.4.1                                                           [12:44:11]
mkdir /opt/homebrew/var/homebrew/linked/openjpeg

# 手动安装组件
brew install gcc
brew install opencv
brew install openjpeg
brew install tesseract

# cp 到环境变量
cp -r /opt/homebrew/Cellar/tesseract/5.3.1/lib /usr/lib