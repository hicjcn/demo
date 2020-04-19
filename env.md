## 环境安装（部分）

### 修改docker源

编辑 `/etc/docker/daemon.json` 文件，重启docker，文件内容如下：
```
{
  "registry-mirrors" : [
    "http://ovfftd6p.mirror.aliyuncs.com",
    "http://registry.docker-cn.com",
    "http://docker.mirrors.ustc.edu.cn",
    "http://hub-mirror.c.163.com"
  ],
  "insecure-registries" : [
    "registry.docker-cn.com",
    "docker.mirrors.ustc.edu.cn",
    "139.9.86.9:30000",
    "106.13.10.5:30000"
  ],
  "debug" : true,
  "experimental" : true
}
```

### portainer安装

```
docker run -d -p 2000:9000 \
--restart=always \
-v /var/run/docker.sock:/var/run/docker.sock \
--name prtainer \
docker.io/portainer/portainer
```

### rancher2.x安装

```
docker run -d --restart=unless-stopped \
  -p 2002:80 -p 2003:443 \
  -v /root/rancher/:/var/lib/rancher/ \
  -v /root/var/log/auditlog:/var/log/auditlog \
  -e CATTLE_SYSTEM_CATALOG=bundled \
  -e AUDIT_LEVEL=3 \
  -v /root/cert/Nginx/1_hw.jcera.cn_bundle.crt:/etc/rancher/ssl/cert.pem \
  -v /root/cert/Nginx/2_hw.jcera.cn.key:/etc/rancher/ssl/key.pem \
  rancher/rancher:stable --no-cacerts
```

### jenkins安装

```
docker run -d --restart=unless-stopped -u root \
  -p 2004:8080 \
  -v jenkins-data:/var/jenkins_home \
  -v /var/run/docker.sock:/var/run/docker.sock \
  jenkinsci/blueocean
```
