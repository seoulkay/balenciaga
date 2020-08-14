Ubuntu Server 18.04 LTS (HVM), SSD Volume Type -
t2.micro
pwd < 지금경로
cd Downloads
ssh -i ./awskey.pem ubuntu@3.17.208.218
sftp -i ./awskey.pem ubuntu@3.17.208.218

//sftp로 올리기
pwd
lpwd
put index.html
put aa.jpg
//내 폴더에서 아파치 폴더로 복사
sudo cp ./aa.jpg /var/www/html/
sudo cp ./index.html /var/www/html/

sudo vi /etc/apache2/conf-available/charset.conf 
