Ext.define('BudgetMS.view.invo.addInstWin', {
	extend : 'BudgetMS.view.invo.baseInstWin',
	alias : 'widget.invoAdd',
	title : '请示新增',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.buttons = [ {
			xtype : 'doAddBtn',
			text : '增加',
			name : 'insertInst',
			action : 'invo/insertInst.do'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
		this.down('form').getForm().findField('invoId').setValue(genInstId());
	}
});
