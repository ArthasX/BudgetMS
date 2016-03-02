Ext.define('BudgetMS.view.ux.button.fileUploadBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias : 'widget.fileUploadBtn',
	text:'上传',
	listeners : {
		'click' : function(btn, e) {
			debugger;
			var form = btn.up('form').getForm();
			console.log(btn, btn.ownerCt, btn.ownerCt.ownerCt);
			var attachType=btn.up('baseFileGrid').name;
			var recordId=btn.up('window').down('form').getForm().findField(+'Id').getValue()
			var fileName = Ext.getCmp('fileUpload').getRawValue();// 上传文件名称的路径
			if (fileName == "") {
				Ext.Msg.show({
					title : '提示',
					msg : '请选择文件!',
					buttons : Ext.Msg.OK,
					icon : Ext.MessageBox.INFOR
				});
				return;
			} else {
				var array = new Array();
				array = fileName.split("\\");
				var length = array.length;
				var fileName = "";
				var index = 0;
				for (index = 0; index < length; index++) {
					if (fileName == "") {
						fileName = array[index];
					} else {
						fileName = fileName + "/" + array[index];
					}
				}
			}
			console.log('filename:', fileName);
			form.submit({
				url : 'attach/upload.do',
				params:{recordId:recordId,attachType:attachType},
				method : 'POST',
				waitMsg : '数据上传中, 请稍等...',
				success : function(form, action) {
					Ext.MessageBox.alert("提示信息", action.result.msg);
				},
				failure : function(form, action) {
					 if (action.failureType === Ext.form.action.Action.CONNECT_FAILURE) {
	                        Ext.Msg.alert('提示信息Error',
	                            'Status:'+action.response.status+': '+
	                            action.response.statusText);
	                    }
	                    if (action.failureType === Ext.form.action.Action.SERVER_INVALID){
	                        // server responded with success = false
	                        Ext.Msg.alert('提示信息Invalid', action.result.errormsg);
	                    }
					 
				} 
			});
		}
	}
})