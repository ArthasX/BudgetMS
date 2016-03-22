Ext.define('BudgetMS.view.ux.baseFileGrid', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.baseFileGrid',
	// border : false,
	store : 'fileStore',
	enableKeyNav : true,// 键盘控制
	columnLines : true,// 竖线
	tbar : [ {
		xtype : 'form',
		border : false,
		items : [ {
			xtype : 'filefield',
			name : 'fileUpload',
			width : 300,
			fieldLabel : '附件',
			msgTarget : 'side',
			allowBlank : false,
			buttonText : '浏览'
		}, {
			xtype : 'fileUploadBtn'
		} ]
	} ],
	fileColumn : [ {
		text : '附件编号',
		dataIndex : 'attachId'
	}, {
		text : '附件名称',
		dataIndex : 'attachName'
	}, {
		text : '下载',
		xtype : 'templatecolumn',
		tpl : '<a href=attach/download.do?fileName={attachName}>下载</a>'
	} ],
	initComponent : function() {
		//可以考虑在这里   new 一个 store 
		this.columns = this.fileColumn;
		this.callParent(arguments);
	},
	listeners : {
		'itemdblclick' : function(grid, record) {
			console.log(record.data)
		}
	},
	loadFile : function() {
		debugger;
		console.log('loadFile')
		var win = this.up('window');
		var recordId = win.down('form').getForm().findField(this.name + 'Id')
				.getValue();
		var store = this.getStore();
		var obj = {
			recordId : recordId,
			attachType : this.name
		};
		var params = {
			obj : Ext.JSON.encode(obj)
		};
//		var store = Ext.create('BudgetMS.store.fileStore');
//		store.proxy.extraParams = params;
		
		console.log(recordId, store, obj, params);
		 Ext.apply(store.proxy.extraParams, params);
//		Ext.apply(this.store, store);
		store.load();
	}
});
