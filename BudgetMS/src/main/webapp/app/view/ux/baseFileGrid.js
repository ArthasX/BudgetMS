Ext.define('BudgetMS.view.ux.baseFileGrid', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.baseFileGrid',
	//border : false,
	store : 'fileStore',
	enableKeyNav : true,// 键盘控制
	columnLines : true,// 竖线
	tbar : [ {
		xtype : 'form',
		border:false,
		items : [ {
			xtype : 'filefield',
			id : 'fileUpload',
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
		tpl : '<a href={url}>下载</a>'
	} ],
	initComponent : function() {
		this.columns = this.fileColumn;
		this.callParent(arguments);
	},
});
