  // 验证码
            var verifyCodeActual =$('#j_kaptcha').val();
            if(!verifyCodeActual){
                $.toast('请输入验证码');
                return;
            }
 
            // 接收数据
            var formData = new FormData();
            // 和后端约定好，利用shopImg和 shopStr接收 shop图片信息和shop信息
            formData.append('shopImg',shopImg);
            // 转成JSON格式，后端收到后将JSON转为实体类
            formData.append('shopStr',JSON.stringify(shop));
 
            // 将数据封装到formData发送到后台
            formData.append('verifyCodeActual',verifyCodeActual);
 
 
            // 利用ajax提交
            $.ajax({
                // 动态判断 url
                url:registerShopUrl,
                type:'POST',
                data:formData,
                contentType:false,
                processData:false,
                cache:false,
                success:function(data){
                    if(data.success){
                        $.toast('提示信息:'+data.errMsg);
                    }else{
                        $.toast('提示信息:' + data.errMsg);
                    }
                    // 点击提交后 不管成功失败都更换验证码，防止重复提交
                    $('#kaptcha_img').click();
                }
            });
