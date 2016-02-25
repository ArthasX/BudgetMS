Ext.define('BudgetMS.controller.instCtrl', {
	extend : 'Ext.app.Controller',
	stores : [ 'instStore' ],
	views : [ 'inst.list', 'inst.edit', 'inst.add', 'inst.instMainForm' ],
	models : [ 'inst' ],
	init : function() {
		this.control({
			//根据方法名，能看懂吧？
			'instMainForm button[id=showAddInst]' : {
				click : this.showAddInstBtnClick
			},
			'instAdd button[action=doAddInst]' : {
				click : this.doAdd
			},
			'instList' : {
				itemdblclick : this.showUpdateInstGridDblClick
			},
			'instMainForm button[name=showUpdateInst]' : {
				click : this.showUpdateInstBtnClick
			},
			'instEdit button[action=doUpdate]' :{
				click : this.doUpdate
			},
			'instMainForm button[name=deleteInst]' : {
				click : this.confirmDelete
			},
			'instMainForm button[name=findInst]' : {
				click : function(btn) {
					console.log(btn.name)
				}
			}
		});
	},
	showUpdateInstBtnClick : function() {
		var grid = Ext.ComponentQuery.query('#instList')[0];// Ext.getCmp('instList')
		var record = grid.getSelectionModel().getLastSelected();
		this.showUpdateInstGridDblClick(grid, record)
	},
	showUpdateInstGridDblClick : function(grid, record) {
		console.log('Double clicked on ' + record.get('instId'));
		// Ext.MessageBox.alert("123","123");
		var view = Ext.widget('instEdit');
		view.down('form').loadRecord(record);
	},

	showAddInstBtnClick : function() {
		console.log('click addInst button');
		var view = Ext.create('BudgetMS.view.inst.add');// Ext.widget

	},

	doAdd : function(btn, e, eOpts) {
		var s = btn.up('window').down('form').getForm().findField('instType')
				.getValue();
		alert(s);
	},

	confirmDelete : function(btn, e, eOpts) {
		var btnId = btn.name;// 根据button的name来确定他的ownerCt的类型
		var fieldName;// 字段名称 instId contId invoId
		// var tableName;
		var grid;// grid组件对象
		// grid=btn.ownerCt.ownerCt.ownerCt.ownerCt; 也可以得到grid
		// btn-panel-instMainForm-instList
		if (btnId == 'deleteInst') {
			grid = Ext.getCmp('instList');
			fieldName = 'instId';
			// tableName='insturction';
		}
		if (btnId == 'deleteCont') {
			grid = Ext.getCmp('contList');
			fieldName = 'contId';
			// tableName='contract';
		}
		if (btnId == 'deleteInvo') {
			grid = Ext.getCmp('invoList');
			fieldName = 'invoId';
			// tableName='invoice';
		}

		var record = grid.getSelectionModel().getLastSelected();
		if (!record) {
			Ext.MessageBox.alert('注意', '请选中一条记录!');
			return;
		}
		//debugger;
		var id = record.data[fieldName];
		var url = fieldName.substring(0, fieldName.length - 2)+'/' + btnId + '.do'
		var params = {
			id : id
		};
		var confirm = Ext.Msg.confirm('确认', '是否删除编号为:' + id + '的记录?', function(
				btn) {
			if (btn == 'yes') {
				doDelete(params, url)
			}
		});
	},
	
	doUpdate: function (btn,e){
		var s = btn.up('window').down('form').getForm().findField('instType')
		.getValue();
	}
});

 function doDelete(params, url) {
	//debugger;
	Ext.Ajax.request({
		url : url,
		params : params,
		success : function(response) {
			var text = response.responseText;
			console.log(text);
			if(text=="success")
				Ext.Msg.alert('','删除成功');
			else
				Ext.Msg.alert('','删除失败');
		}
	});
}
 
 